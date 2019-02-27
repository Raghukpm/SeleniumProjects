<head>
<style>
.dropbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f1f1f1;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}
.dropdown-content{
	width: 10px;
}

.dropdown:hover .dropbtn {
	background-color: #3e8e41;
}
</style>
</head>
<body>
	<div class="dropdown">
		<button class="dropbtn">About Us</button>
		<div class="dropdown-content">
			<a [routerLink]="['/accreditation']">Accrediation</a> <a
				[routerLink]="['mission']">Mission</a>
		</div>
	</div>
	<div class="dropdown">
		<button class="dropbtn">Academics</button>
		<!-- drop down list will be here -->
	</div>

	<div class="dropdown">
		<button class="dropbtn">Programs</button>
		<!-- Drop down will write same as first one -->
	</div>

	<div class="dropdown">
		<button class="dropbtn">Admissions</button>
		<!--Drop down will write as first one  -->
	</div>

	<div class="dropdown">
		<button class="dropbtn">Campuses</button>
		<!-- Drop will like first one -->
	</div>

</body>
<router-outlet></router-outlet>
