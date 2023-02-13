package com.example.demo.repository;

import com.example.demo.model.sql.TbStudent;
import com.querydsl.core.types.QBean;
import com.querydsl.sql.SQLQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.model.sql.QStudent.student;
import static com.querydsl.core.types.Projections.bean;


@Repository

public class StudentRepository {

    @Autowired
    private SQLQueryFactory sqlQueryFactory;
    private static final QBean<TbStudent> qTbStudent = bean(TbStudent.class, student.all());


    public List<TbStudent> findAll() {

        return sqlQueryFactory.select(qTbStudent).from(student).fetch();
    }


    // Insert

    public Long insert() {
        return sqlQueryFactory.insert(student)
                .columns(student.id, student.firstname, student.lastname, student.stuAge)
                .values(1301, "Kimia", "khanlari", 25).execute();
    }

    public Long delete() {
        sqlQueryFactory.delete(student)
                .where(student.id.eq(Long.valueOf("1300")))
                .execute();
        return null;

    }

    public Long update() {
      return    sqlQueryFactory.update(student)
                .where(student.id.eq(Long.valueOf("1301")))
                .set(student.firstname, "tt")
                .execute();

    }

}
