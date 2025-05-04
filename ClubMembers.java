import java.util.ArrayList;
public class ClubMembers  
{  


private ArrayList<MemberInfo> memberList;  

public ClubMembers(ArrayList<MemberInfo> m)
{
    memberList =m;
}
/** Adds new club members to memberList, as described in part (a).  
* Precondition: names is a non-empty array.  
*/  
public void addMembers(String[] names, int gradYear)  
{ 
    for(int x = 0; x<names.length; x++)
    {
        memberList.add(new MemberInfo(names[x], gradYear, true));
    }
}  



/** Removes members who have graduated and returns a list of members who have graduated  * and are in good standing, as described in part (b).  
*/  
public ArrayList<MemberInfo> removeMembers(int year)  
{
    ArrayList<MemberInfo> grads = new ArrayList<>();

    for(int x =0; x<memberList.size(); x++){
        if(memberList.get(x).getGradYear() <= year && memberList.get(x).inGoodStanding()) 
        {
            grads.add(memberList.get(x));
        }
    }
    if(grads.size()==0) return grads;

    for (int x = memberList.size() - 1; x >= 0; x--) {
        MemberInfo m = memberList.get(x);
        if (m.getGradYear() <= year) {
            memberList.remove(x);
    }
    }

    for(int x = 0; x<grads.size(); x++)
    System.out.println(grads.get(x).getname());
    return grads;

}  


public void GetList()
{
    for(int x = 0; x<memberList.size(); x++)
    System.out.println(memberList.get(x).getname());
}

}  



