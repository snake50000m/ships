package kg.internship.ships.services;

import kg.internship.ships.models.dto.ClassNames;

import java.util.List;

public interface ClassService {
    List<ClassNames> findClassNameByResult(String result);
}
