package co.edu.ue.service;

import java.util.List;
import java.util.stream.Collectors;

import co.edu.ue.model.DTOCourse;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Course;
import co.edu.ue.repository.CourseRepository;


@Service
public class CourseService {

    CourseRepository data = new CourseRepository();
    final Float IVA = 0.19f;
    final Float DESC = 0.05f;

    public List<Course> allDataList(){
        return data.getListCourses();
    }

    public Course courseById(Long id){
        return data.getCourseById(id);
    }
    public Course updateCourse(DTOCourse dtoCourse){
        return data.putCourse(dtoCourse);
    }

    public List<Course> addCourse(Course course){
        return data.postCourse(course);
    }

    public List<Course> coursesSale(){
        return data.getListCourses().stream().map(
            c -> {
                double value = (c.getPrice() - (c.getPrice() * DESC));
                return new Course(c.getId(), c.getName(), c.getDescription(), (long) value);
            }).collect(Collectors.toList());
    }

    public List<Course> coursesIVA(){
        return data.getListCourses().stream().map(
            c -> {
                double value = (c.getPrice() + (c.getPrice() * IVA));
                c.setPrice((long) value);
                return c;
            }).collect(Collectors.toList());
    }

}
