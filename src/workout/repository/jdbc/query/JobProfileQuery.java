package az.workout.repository.jdbc.query;

public class JobProfileQuery {

    public  static  final  String GET_JOB_PROFILE="select j.id job_id , j.position,j.about,j.requirement,\n" +
            "j.salary_min,j.salary_max,j.post_date,j.deadline,\n" +
            "j.experience_min,j.experience_max, j.desciption,\n" +
            "j.job_category_id,jb.name job_category_name,\n" +
            "j.organization_id,o.name organization_name,  o.head_office,\n" +
            "j.address_id, a.info , a.zipcode  ,\n" +
            "a.country_id, co.name country_name,\n" +
            "a.city_id, ci.name city_name,\n" +
            "j.job_type_id, jt.name job_type_name,\n" +
            "r.id response_id, r.descript, r.descript2, r.descript3,r.descript4\n" +
            " from job j join job_category jb on j.job_category_id=jb.id and jb.status=1\n" +
            " join organization o on j.organization_id=o.id and o.status=1\n" +
            " join address a on j.address_id=a.id and a.status=1\n" +
            " join country co on a.country_id=co.id and co.status=1\n" +
            " join city ci on a.city_id=ci.id and ci.status=1\n" +
            " join job_type jt on j.job_type_id=jt.id and jt.status=1\n" +
            " join responsibility r on r.job_id= j.id and r.status=1\n" +
            " where j.status=1  and j.id={OFFSET}";
}
