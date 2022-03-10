package az.workout.repository.jdbc.query;

public class SqlQuery {

    public static  final String GET_CATEGORY_COUNT=" select jcp.id,jcp.name,jcp.icon_class , count(j.id) job_count" +
            " from job j join job_category jc on j.job_category_id=jc.id and jc.status=1\n" +
            " join job_category jcp on jc.parent_id=jcp.id\n" +
            " group by jcp.id,jcp.name,jcp.icon_class";

    public  static  final String GET_ALL_JOB_COUNT=" select count(j.id)\n" +
            "from job j\n" +
            "where status=1";

    public static  final  String GET_RECENT_JOB="select j.id job_id,j.position,j.about,j.requirement,j.salary_min, \n" +
            "j.salary_max,j.post_date,j.deadline,j.experience_min,j.experience_max,\n" +
            "u.id user_id,u.name user_name,u.surname,u.email user_email,u.mobile user_mobile,\n" +
            "a.id address_id,c.id country_id,c.name country_name,ct.id  city_id,ct.name city_name,a.info,\n" +
            "jt.id  job_type_id,jt.name job_type_name,\n" +
            "jc.id job_category_id,jc.name job_category_name\n" +
            "from job j join user u  on j.user_id=u.id and u.status=1\n" +
            "join  address a on j.address_id=a.id and a.status=1\n" +
            "join country c on a.country_id=c.id and c.status=1\n" +
            "join city ct on a.city_id=ct.id  and ct.status=1\n" +
            "join job_type jt on j.job_type_id= jt.id and jt.status=1\n" +
            "join job_category jc on j.job_category_id=jc.id and jc.status=1\n" +
            "order by j.post_date\n" +
            "limit 10;";
    public static  final  String GET_WEB_COMPANY_LIST="select o.id org_id , o.name org_name, o.head_office,o.create_date,\n" +
            "o.about, o.num_of_employee, o.annual_revenue,o.is_global,o.rating,\n" +
            "o.phone,o.mobile,o.website,o.email,\n" +
            "i.id industry_id,i.name industry_name\n" +
            "from organization o join industry i on o.industry_id=i.id and i.status=1\n" +
            "where o.status=1\n" +
            "order by o.rating DESC\n" +
            "limit 8";
    public  static  final  String GET_COMPANY_COUNT="select count(o.id)\n" +
            "from organization o\n" +
            "where o.status=1";
    public  static  final String  GET_COMPANIES_LIST="select o.id org_id , o.name org_name, o.head_office,o.create_date,\n" +
            "o.about, o.num_of_employee, o.annual_revenue,o.is_global,o.rating,\n" +
            "o.phone,o.mobile,o.website,o.email,\n" +
            "i.id industry_id,i.name industry_name\n" +
            "from organization o join industry i on o.industry_id=i.id and i.status=1\n" +
            "where o.status=1\n" +
            "order by o.rating DESC\n" +
            "limit {OFFSET} , 10";

    public static final String GET_CANDIDATE_LIST="select c.id candidate_id, \n" +
            "u.id user_id, u.name user_name,u.surname user_surname,\n" +
            " c.position, c.birthdate,  c.salary_min, c.salary_max,\n" +
            "u.email,u.password user_password , u.mobile,i.id image_id , i.picture,\n" +
            "a.id address_id,co.id country_id,co.name country_name,\n" +
            "ci.id city_id, ci.name city_name,a.info,\n" +
            "e.id education_level_id, e.name education_level_name,\n" +
            "ce.id certificate_id,ce.title,ce.agency,ce.certificateDate,\n" +
            "jb.id  job_history_id , jb.idate job_history_idate,jb.udate job_history_udate,\n" +
            "l.id language_id,l.name language_name\n" +
            "from candidate c join user u on c.user_id=u.id and u.status=1 and u.user_status_id=1\n" +
            "join image i on u.image_id=i.id and i.status=1\n" +
            "join address a on c.address_id=a.id and a.status=1\n" +
            "join country co on a.country_id=co.id and co.status=1\n" +
            "join city ci on a.city_id=ci.id and ci.status=1 \n" +
            "join education_level e on c.education_level_id=e.id and e.status=1\n" +
            "join certificate ce on c.certificate_id=ce.id and ce.status=1\n" +
            "join job_history jb on c.job_history_id=jb.id and jb.status=1\n" +
            "join language l on c.languages_id=l.id and l.status=1\n" +
            "where    c.status=1\n" +
            "limit {OFFSET} , 10";

    public  static  final  String GET_CANDIDATES_COUNT="select count(c.id)\n" +
            "from candidate c\n" +
            "where c.status=1";
    public static final String GET_JOBS_LIST_WITH_PAGING=" select j.id job_id,j.position,j.about,j.requirement,j.salary_min, \n" +
            "            j.salary_max,j.post_date,j.deadline,j.experience_min,j.experience_max,\n" +
            "            u.id user_id,u.name user_name,u.surname,u.email user_email,u.mobile user_mobile,\n" +
            "            a.id address_id,c.id country_id,c.name country_name,ct.id  city_id,ct.name city_name,a.info,\n" +
            "            jt.id  job_type_id,jt.name job_type_name,\n" +
            "            jc.id job_category_id,jc.name job_category_name\n" +
            "            from job j join user u  on j.user_id=u.id and u.status=1\n" +
            "            join  address a on j.address_id=a.id and a.status=1\n" +
            "            join country c on a.country_id=c.id and c.status=1\n" +
            "            join city ct on a.city_id=ct.id  and ct.status=1\n" +
            "            join job_type jt on j.job_type_id= jt.id and jt.status=1\n" +
            "            join job_category jc on j.job_category_id=jc.id and jc.status=1\n" +
            "            where j.status=1\n" +
            "            order by j.id desc\n" +
            "            limit  {Offset}, 12";




}
