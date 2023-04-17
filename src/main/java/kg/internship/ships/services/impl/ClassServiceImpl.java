package kg.internship.ships.services.impl;

import kg.internship.ships.dao.ClassRepo;
import kg.internship.ships.models.Class;
import kg.internship.ships.models.dto.ClassNames;
import kg.internship.ships.services.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl implements ClassService {

    private  final ClassRepo classRepo;

    public ClassServiceImpl(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }

    @Override
    public List<ClassNames> findClassNameByResult(String result) {
        List<Class> classList = classRepo.findClassNameByResult(result);
        List<ClassNames> classNamesList = classList
                .stream()
                .map(x->{
                    ClassNames classNames = new ClassNames();
                    classNames.setClass_name(x.getClass_name());
                    return classNames;
                })
                .collect(Collectors.toList());

        return classNamesList;
    }
}
