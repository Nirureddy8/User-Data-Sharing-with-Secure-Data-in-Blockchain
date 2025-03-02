
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.DBConnection"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>blueneek</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
   </head>
   <!-- body -->
   <body class="main-layout">
      <!-- loader  -->
      <div class="loader_bg">
         <div class="loader"><img src="images/loading.gif" alt="#" /></div>
      </div>
      <!-- end loader -->
      <!-- header -->
      <header>
         <!-- header inner -->
         <div class="header">
            <div class="container-fluid">
               <div class="row">
                  <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                     <div class="full">
                        <div class="center-desk">
                           <div class="logo">
                              <a href="index.html"><img src="images/logo.png" alt="#" /></a>
                           </div>
                        </div>
                     </div>
                  </div>
                  <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                     <div class="header_information">
                        <nav class="navigation navbar navbar-expand-md navbar-dark ">
                           <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                           <span class="navbar-toggler-icon"></span>
                           </button>
                           <div class="collapse navbar-collapse" id="navbarsExample04">
                              <ul class="navbar-nav mr-auto">
                                 <li class="nav-item ">
                               <!--   <li class="nav-item active"> -->
                                    <a class="nav-link" href="GeneratePrivateKey.jsp">Generate Private Key</a>
                                 </li> 
                                 <li class="nav-item ">
                                    <a class="nav-link" href="StoreData.jsp">Message</a>
                                   <li>
                                    
                                 <li class="nav-item">
                                    <a class="nav-link" href="ViewData.jsp">View Message</a>
                                 </li>
                                 <li class="nav-item">
                                    <a class="nav-link" href="requestedFiles.jsp">Message Request</a>
                                 </li>
                                <!--  <li class="nav-item">
                                    <a class="nav-link" href="SharePrivateKey.jsp">Share Private Key</a>
                                 </li> -->
                                 <li class="nav-item">
                                    <a class="nav-link" href="index.html">Logout</a>
                                 </li>
                              </ul>
                              <div class="sign_btn"><a href="#">Get A Quote</a></div>
                           </div>

                        </nav>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </header>
      <!-- end header inner -->
      <!-- end header -->
    
      <!-- about -->
     <!--  <div id="about"  class="about">
         <div class="container"> -->
          <!--   <div class="row d_flex">
               <div class="col-md-7"> -->
                  <div class="titlepage">
                   <h1 class="carousel-title">View Data</h1>
                    <br><br>
                  <%
		session = request.getSession(false);
		String name = (String) session.getAttribute("email");
		System.out.println("nameewe"+name);
		String sql1="select Cserver from user where Email=?";
		String cloudUser=DBConnection.getUserCloud(sql1,name);
		System.out.println(cloudUser);
		String sql = "select * from store";
		List<String> lt = DBConnection.getFile(sql);
		Iterator<String> itr = lt.iterator();
		
		String sqlapprove = "select * from requestfile where useremail=? and status='approved'";
		
		List<String> lt1 = DBConnection.getFileapprove(sqlapprove,name);
		Iterator<String> itr1 = lt1.iterator();
		
		
		
 		%>
      <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <div class="container">
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                </ol>
            </div>

            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <!-- <img class="img-responsive" src="img/1920x1080/abp.jpg" alt="Slider Image">  -->
                    <div class="container">
                        <div class="carousel-centered">
                            <div class="margin-b-40">
                            <div class="inner" >
                          <!--   <h1 class="carousel-title">View Data</h1> -->
                    <br><br>
                  <table class="w3-table w3-blue" style="width:1150px;text-align: center;font-size: 16px;" border="1">
				<thead>
				<tr style="color: black;">
				<th>User ID</th>
				<th>Message Details</th>
				<th>Server Name</th>
				<th>View</th>
				</tr>
				</thead>
				<%
				while(itr.hasNext())
				{
					String fileid=itr.next();
				String userid=itr.next();
					String fileName=itr.next();
					String cloud=itr.next();
					String time=itr.next();
					System.out.println("ffffff"+fileid);
					
				%>
				<tr style="color: black;">
				<td><%=userid %></td>
				<td><%=fileName %></td>
				<td><%=cloud %></td>
				
				<%if(userid.equalsIgnoreCase(name)){%>
					<td><a href="ViewData?da=<%=time%>" class="w3-button w3-black">View</a>
				<%}else{%>
				<td><a href="RequestFile?ownerid=<%=userid%>&&fileid=<%=fileid%>&&userid=<%=name%>">Request</a></td>
				<%
				}}%>
				</table>
				<br><br>
				<!-- <h1>Approved Files</h1> -->
				
				
				
					<%
				while(itr1.hasNext())
				{
					//String wonerid=itr1.next();
				  String userid=itr1.next();
					String status=itr1.next();
					String fileid=itr1.next();
					
					System.out.println("ffffff"+fileid);
					
				%>
				<tr style="color: black;">
				
				<td><%=userid %></td>
				<td><%=status %></td>
				
				<td><a href="downloadfile?fileid=<%=fileid%>">
<button type="download" form="form1" value="dowload">download</button></a></td>	
				
				
				
				<%} %>
				</div>
                          
							
                        
                       
                        </div>
                      
               <br><br><br><br><br><br>
               
              
               <div class="col-md-5">
                  <div class="about_img">
                 <!--     <figure><img src="images/about_img.png" alt="#"/></figure> -->
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- end about -->
      <br><br><br><br><br><br> <br><br>
      <!--  footer -->
      <footer>
         <div class="footer">
            <div class="container">
               <div class="row border-top">
                  <div class="col-md-6 padding_bottom1   ">
                     <h3>Subscribe Now</h3>
                     <form class="footer_form">
                        <input class="enter" placeholder="Enter your email" type="type" name="Enter your email">
                        <button class="submit">submit</button>
                     </form>
                  </div>
                  <div class="col-md-6">
                     <div class="row">
                        <div class="col-md-5 offset-md-1 padding_bottom1">
                           <h3>Links</h3>
                           <ul class="cont">
                              <li>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do </li>
                           </ul>
                        </div>
                        <div class="col-md-5 offset-md-1">
                           <h3>Contact us</h3>
                           <ul class="cont">
                              <li>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do </li>
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
            <div class="copyright">
               <div class="container">
                  <div class="row">
                     <div class="col-md-12">
                        <p>© 2024 All Rights Reserved. <a href="https://html.design/"> Free Html Templates</a></p>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </footer>
      <!-- end footer -->
      <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
    
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
   </body>
</html>

