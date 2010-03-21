class PersonService {
  this: PersonDAO with UtilityDAO => 

  def login(name:String, password:String) = {
    if (checkPassword(name,password)) 
      val token = recordLogin(name)
      Some(token)
    else
      None
  }
}