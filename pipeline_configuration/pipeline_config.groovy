libraries {
	maven
}

application_environments{
  dev{
    ip_addresses = [ "1.2.3.4", "1.2.3.5" ]
  }
  test
  prod{
    ip_addresses = [ "1.2.3.6", "1.2.3.7" ]
  }
}