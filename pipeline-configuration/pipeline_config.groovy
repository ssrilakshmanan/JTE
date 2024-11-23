allow_scm_jenkinsfile = false

libraries {
	merge = true
	maven
}

application_environment {
	dev {
		CH_ENV = "DEV"
		MULE_ENV = "dev"
	}
	
	qa {
		CH_ENV = "QA"
		MULE_ENV = "qa"	
	}
}