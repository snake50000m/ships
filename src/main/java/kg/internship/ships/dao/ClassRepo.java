package kg.internship.ships.dao;

import kg.internship.ships.models.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClassRepo extends JpaRepository<Class, String> {

    @Query(value = "SELECT cl.class\n" +
            " FROM classes cl\n" +
            " LEFT JOIN ships s ON s.class = cl.class\n" +
            " WHERE cl.class IN (SELECT ship FROM outcomes WHERE result = ?1) OR\n" +
            " s.name IN (SELECT ship FROM outcomes WHERE result = ?1)\n" +
            " GROUP BY cl.class", nativeQuery = true)
    List<Class> findClassNameByResult(String result);
}
