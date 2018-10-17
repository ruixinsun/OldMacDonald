class NamedCow extends Cow
{
  private String myName;
  NamedCow(String name)
  {
    myName = name;
    
  }
  public String getName(){return myName;} 
}
