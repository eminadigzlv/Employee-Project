<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 
Version: 1.0.0
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
    <meta charset="utf-8" />
    <title>Listing_single</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta name="description" content="employee" />
    <meta name="keywords" content="employee" />
    <meta name="author" content="" />
    <meta name="MobileOptimized" content="320" />
    <!--srart theme style -->
    <link rel="stylesheet" type="text/css" href="../css/animate.css" />
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../css/font-awesome.css" />
    <link rel="stylesheet" type="text/css" href="../css/fonts.css" />
    <link rel="stylesheet" type="text/css" href="../css/reset.css" />
    <link rel="stylesheet" type="text/css" href="../css/owl.carousel.css" />
    <link rel="stylesheet" type="text/css" href="../css/owl.theme.default.css" />
    <link rel="stylesheet" type="text/css" href="../css/flaticon.css" />
    <link rel="stylesheet" type="text/css" href="../css/style_II.css" />
    <link rel="stylesheet" type="text/css" href="../css/responsive2.css" />
    <!-- favicon links -->
    <link rel="shortcut icon" type="image/png" href="images/header/favicon.ico" />
</head>

<body>
    <!-- preloader Start -->
    <div id="preloader">
        <div id="status"><img src="../images/header/loadinganimation.gif" id="preloader_image" alt="loader">
        </div>
    </div>
    <!-- Top Scroll End -->
    <!-- Top Header Wrapper Start -->
    <div class="jp_top_header_main_wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                    <div class="jp_top_header_left_wrapper">
                        <div class="jp_top_header_left_cont">
                            <p class=""><i class=""></i> &nbsp;&nbsp;<a href="/">Employee.az</a></p>
                            <p class=""><i class=""></i> &nbsp;Email :&nbsp;<a href="#">mrs.aygunsva@gmail.com</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                    <div class="jp_top_header_right_wrapper">
                        <div class="jp_top_header_right_cont">
                            <ul>
                                <li><a href="/register"><i class="fa fa-user"></i>&nbsp; SIGN UP</a></li>
                                <li><a href="/login"><i class="fa fa-sign-in"></i>&nbsp; LOGIN</a></li>
                            </ul>
                        </div>
                        <div class="jp_top_header_right__social_cont">
                            <ul>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Top Header Wrapper End -->
    <!-- Header Wrapper Start -->
    <div class="jp_top_header_img_wrapper">
        <div class="gc_main_menu_wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12 hidden-xs hidden-sm full_width">
                        <div class="gc_header_wrapper">
                            <div class="gc_logo">
                                <a href="/">
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 full_width">
                        <div class="header-area hidden-menu-bar stick" id="sticker">
                            <!-- mainmenu start -->
                            <div class="mainmenu">
                                <ul class="float_left" >

                                    <li class="has-mega gc_main_navigation"><a href="/job/" class="gc_main_navigation"> Job&nbsp; </a>
                                    </li>
                                    <li class="parent gc_main_navigation"><a href="/candidate/" class="gc_main_navigation">Candidates &nbsp</a>
                                    </li>
                                    <li class="has-mega gc_main_navigation"><a href="/company/" class="gc_main_navigation"> Companies&nbsp; </a>
                                    </li>
                                    <li class="has-mega gc_main_navigation"><a href="/aboutUs/" class="gc_main_navigation"> About Us&nbsp; </a>
                                    </li>
                                </ul>
                            </div>
                            <!-- mainmenu end -->
                            <!-- mobile menu area start -->
                        </div>
                    </div>
                    <!-- mobile menu area end -->
                </div>
            </div>
        </div>
    </div>
    <!-- Header Wrapper End -->
    <!-- jp Tittle Wrapper Start -->
    <div class="jp_tittle_main_wrapper">
        <div class="jp_tittle_img_overlay"></div>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="jp_tittle_heading_wrapper">
                        <c:forEach items="${JobProfile}" var="item">
                        <div class="jp_tittle_heading">
                            <h2>${item.experience_min} ~ ${item.experience_max} Yrs Exp.</h2>
                        </div>
                        </c:forEach>
                        <div class="jp_tittle_breadcrumb_main_wrapper">
                            <div class="jp_tittle_breadcrumb_wrapper">
                                <ul>
                                    <li><a href="/">Home</a> <i class="fa fa-angle-right"></i></li>
                                    <li><a href="/job/">Jobs</a> <i class="fa fa-angle-right"></i></li>
                                    <li><a >Developer</a> <i class="fa fa-angle-right"></i></li>

                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- jp Tittle Wrapper End -->
    <!-- jp listing Single cont Wrapper Start -->
    <div class="jp_listing_single_main_wrapper">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                    <div class="jp_listing_left_sidebar_wrapper">
                        <c:forEach items="${JobProfile}" var="item">
                        <div class="jp_job_des">
                            <h2>Job Description</h2>
                            <p>${item.desciption}</p>
                            <ul>
                                <li><i class="fa fa-globe"></i>&nbsp;&nbsp; <a href="/company/profile?id=${item.organization.id}">View Organization</a></li>

                            </ul>
                        </div>
                        <div class="jp_job_res">
                            <h2>Responsibilities</h2>
                            <ul>
                                <li><i class="fa fa-caret-right"></i>&nbsp;&nbsp; ${item.responsibility.descript}</li>
                                <li><i class="fa fa-caret-right"></i>&nbsp;&nbsp; ${item.responsibility.descript2}</li>
                                <li><i class="fa fa-caret-right"></i>&nbsp;&nbsp; ${item.responsibility.descript3}</li>
                                <li><i class="fa fa-caret-right"></i>&nbsp;&nbsp; ${item.responsibility.descript4}</li>

                            </ul>
                        </div>
                        <div class="jp_job_res jp_job_qua">
                            <h2>Minimum qualifications</h2>
                            <ul>
                                <li><i class="fa fa-caret-right"></i>&nbsp;&nbsp;${item.about}</li>

                            </ul>
                        </div>
                        </c:forEach>
                    </div>
                    <div class="jp_listing_left_bottom_sidebar_wrapper">
                        <div class="jp_listing_left_bottom_sidebar_social_wrapper">
                            <ul class="hidden-xs">
                                <li>SHARE :</li>
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                <li class="hidden-xs"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li class="hidden-xs"><a href="#"><i class="fa fa-vimeo"></i></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="jp_listing_left_bottom_sidebar_key_wrapper">
                        <ul>
                            <li><i class="fa fa-tags"></i>Keywords :</li>
                            <li><a href="#">ui designer,</a></li>
                            <li><a href="#">developer,</a></li>
                            <li><a href="#">senior</a></li>
                            <li><a href="#">it company,</a></li>
                            <li><a href="#">design,</a></li>
                            <li><a href="#">call center</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="jp_rightside_job_categories_wrapper jp_rightside_listing_single_wrapper">
                                <c:forEach items="${JobProfile}" var="item">
                                <div class="jp_rightside_job_categories_heading">
                                    <h4>Job Overview</h4>
                                </div>
                                <div class="jp_jop_overview_img_wrapper">
                                    <div class="jp_jop_overview_img">
                                        <img src="../images/content/job_post_img1.jpg" alt="post_img" />
                                    </div>
                                </div>
                                <div class="jp_job_listing_single_post_right_cont">
                                    <div class="jp_job_listing_single_post_right_cont_wrapper">
                                        <h4>${item.position} (${item.experience_min} - ${item.experience_max} Yrs Exp.)</h4>
                                        <p>${item.organization.name}</p>
                                    </div>
                                </div>
                                <div class="jp_job_post_right_overview_btn_wrapper">
                                    <div class="jp_job_post_right_overview_btn">
                                        <ul>
                                            <li><a href="#"><i class="fa fa-heart-o"></i></a></li>
                                            <li><a >${item.jobType.name}</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="jp_listing_overview_list_outside_main_wrapper">
                                    <div class="jp_listing_overview_list_main_wrapper">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-calendar"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Date Posted:</li>
                                                <li>${item.post_date}</li>
                                            </ul>
                                            <ul>
                                                <li>Deadline</li>
                                                <li>${item.deadline}</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-map-marker"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Location:</li>
                                                <li>${item.address.country.name},${item.address.city.name},${item.address.info} ${item.address.zipCode}</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-info-circle"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Job Title:</li>
                                                <li>${item.position}</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-clock-o"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Job Type:</li>
                                                <li>${item.jobType.name}</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-money"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Salary:</li>
                                                <li>${item.salary_min} - ${item.salary_max} P.A.</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-th-large"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Category:</li>
                                                <li>${item.jobCategory.name}</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_overview_list_main_wrapper jp_listing_overview_list_main_wrapper2">
                                        <div class="jp_listing_list_icon">
                                            <i class="fa fa-star"></i>
                                        </div>
                                        <div class="jp_listing_list_icon_cont_wrapper">
                                            <ul>
                                                <li>Experience:</li>
                                                <li>${item.experience_min} ~ ${item.experience_max} Years Experience</li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="jp_listing_right_bar_btn_wrapper">
                                        <div class="jp_listing_right_bar_btn">
                                            <ul>
                                                <li><a href="/company/profile?id=${item.organization.id}"><i class="fa fa-plus-circle"></i> &nbsp;View Company !</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="jp_main_footer_img_wrapper">
        <div class="jp_newsletter_img_overlay_wrapper"></div>
        <!-- jp Newsletter Wrapper End -->
        <!-- jp footer Wrapper Start -->
        <div class="jp_footer_main_wrapper">
            <div class="container">
                <div class="row">
                    <div class="jp_footer_top_main_wrapper">
                        <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                            <div class="jp_footer_logo_wrapper">
                                <div class="jp_footer_logo">
                                    <a href="/">
                                        <img src="../images/index_iv/resume_logo.png" alt="footer_logo" />
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                            <div class="jp_footer_right_wrapper">
                                <ul>
                                    <li>
                                        <a href="/aboutUs/">
                                            <img src="../images/index_iv/f1.png" alt="img">&nbsp;&nbsp; Contact our Office</a>
                                    </li>
                                    <li>
                                        <a href="/job/">
                                            <img src="../images/index_iv/f2.png" alt="img">&nbsp;&nbsp;recent job</a>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="jp_footer_three_sec_main_wrapper">
                        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                            <div class="jp_footer_first_cont_wrapper">
                                <div class="jp_footer_first_cont">
                                    <h2>About Us</h2>
                                    <ul>
                                        <p>Thank you for choosing us! Welcome back! </p>
                                        <li><i class="fa fa-plus-circle"></i>  <a href="/aboutUs/">READ MORE</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                            <div class="jp_footer_candidate_wrapper jp_footer_candidate_wrapper2">
                                <div class="jp_footer_candidate">
                                    <h2>Information</h2>
                                    <ul>
                                        <li><a href="/candidate/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Candidate Dashboard</a>
                                        </li>
                                        <li><a href="/job/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Job Page</a>
                                        </li>
                                        <li><a href="/aboutUs/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> My Account</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                            <div class="jp_footer_candidate_wrapper jp_footer_candidate_wrapper3">
                                <div class="jp_footer_candidate">
                                    <h2>Customer Support</h2>
                                    <ul>
                                        <li><a href="/company/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Company Dashboard</a>
                                        </li>
                                        <li><a href="/job/add_post"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Add Job</a>
                                        </li>
                                        <li><a href="/job/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Job Page</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
                            <div class="jp_footer_candidate_wrapper jp_footer_candidate_wrapper4">
                                <div class="jp_footer_candidate">
                                    <h2>Have Questions?</h2>
                                    <ul>
                                        <li><a href="/aboutUs/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> About Us</a>
                                        </li>
                                        <li><a href="/aboutUs/"><i class="fa fa-long-arrow-right" aria-hidden="true"></i> Contact Us</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="jp_bottom_footer_main_wrapper">
            <div class="jp_bottom_top_scrollbar_wrapper"> <a href="javascript:" id="return-to-top"><i class="fa fa-angle-up"></i></a>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="jp_bottom_footer_Wrapper">
                            <div class="row">
                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                    <div class="jp_bottom_footer_left_cont">
                                        <p>Welcome Employee.az <a ></a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <script src="../js/jquery_min.js"></script>
    <script src="../js/bootstrap.js"></script>
    <script src="../js/jquery.menu-aim.js"></script>
    <script src="../js/jquery.countTo.js"></script>
    <script src="../js/jquery.inview.min.js"></script>
    <script src="../js/owl.carousel.js"></script>
    <script src="../js/modernizr.js"></script>
    <script src="../js/jquery.magnific-popup.js"></script>
    <script src="../js/custom_II.js"></script>
    <!--main js file end-->
    <script>

    </script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCmdG8C6ItElq5ipuFv6O9AE48wyZm_vqU&amp;callback=initMap">
    </script>
</body>


</html>