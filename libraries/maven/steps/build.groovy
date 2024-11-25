void call() {
	stage("maven: Build") {
		print "build from the maven library"
		bat 'mvn -s C:/Users/ssrilakshmanan/.m2/settings.xml clean test'
	}
}