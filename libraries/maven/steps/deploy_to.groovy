void call(app_env){
  // use the default long_name property to dynamically name the stage
  stage("Deploy to ${app_env.CH_ENV}"){
		echo "Deploying..........."
  }
}