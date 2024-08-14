package co.edu.ue.repository;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import co.edu.ue.model.Course;
import co.edu.ue.model.DTOCourse;
import org.springframework.web.client.HttpClientErrorException;

public class CourseRepository{

    List<Course> dataCourse;

    public CourseRepository() {
        this.dataCourse = new ArrayList<>(Arrays.asList(
            new Course((long) 1, "Java", "Curso Java Basic", (long) 60),
            new Course((long) 2, "Python", "Curso Python Basic", (long) 60),
            new Course((long) 3, "TypeScript", "Curso TypeScript Basic", (long) 60),
            new Course((long) 4, "Kotlin", "Curso Kotlin Basic", (long) 60),
            new Course((long) 5, "C#", "Curso C# Basic", (long) 60)
            
        ));

    }

    public List<Course> getListCourses() {
        return dataCourse.stream().filter(course -> course.getActive().equals(true))
                .collect(Collectors.toList());
    }

    public Course getCourseById(Long id){
        return dataCourse.stream().filter(course -> course.getActive().equals(true))
                .toList().stream().filter(c -> c.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Course> postCourse(Course course){
        return dataCourse;
    }

    public Course putCourse(DTOCourse datosCourse){
        Course course = getCourseById(datosCourse.id());
        if(datosCourse.name() != null || datosCourse.description() != null || datosCourse.price() != null){
            if(datosCourse.name() != null){
                course.setName(datosCourse.name());
            }
            if(datosCourse.description() != null){
                course.setDescription(datosCourse.description());
            }
            if(datosCourse.price() != null && datosCourse.price() >= 0){
                course.setPrice(datosCourse.price());
            }
        } else {
            System.out.println("Nada que cambiar.");
        }
        return course;
    }
    
}
