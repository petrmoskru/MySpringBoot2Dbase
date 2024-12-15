package ru.springboot.myspringboot2dbase.service;

import org.springframework.stereotype.Service;
import ru.springboot.myspringboot2dbase.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {

    List<Discipline> getAllDisciplines();

    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}