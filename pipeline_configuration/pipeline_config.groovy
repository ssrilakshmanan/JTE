allow_scm_jenkinsfile = false

libraries {
    testlib
	//maven
}

application_environment {
	merge = true
	override = false
	dev {
		CH_ENV = "DEV"
		MULE_ENV = "dev"
	}
	
	qa {
		CH_ENV = "QA"
		MULE_ENV = "qa"	
	}
}