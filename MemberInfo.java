public class MemberInfo  
{  
public String n = "";
public int grad = 0;
public boolean stand = false;


public MemberInfo(String name, int gradYear, boolean hasGoodStanding)  
{ 
    n=name;
    gradYear=grad;
    stand = hasGoodStanding;
}  

public String getname()
{
  return n;
}
public int getGradYear()  
{return grad;}  

public boolean inGoodStanding()  
{ return stand;}  

}  
