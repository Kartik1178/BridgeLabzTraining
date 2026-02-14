abstract class CourseType{
    String getCourseType();
}
class ExamCourse implements CourseType(){
    String getCourseType(){
        return "exam course";
    }
        }

class AssignmentCourse implements CourseType(){

String getCourseType() {
    return "assignment course";
}
}
class ResearchCourse implements CourseType(){

String getCourseType() {
    return "research course";
}
}
class Course<T extends CourseType>{
    T courseType;
    String courseName;
    findCourseType(){

    }


}