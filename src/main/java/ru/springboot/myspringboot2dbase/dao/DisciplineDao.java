package ru.springboot.myspringboot2dbase.dao;

import org.springframework.stereotype.Repository;
import ru.springboot.myspringboot2dbase.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineDao {

    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}
