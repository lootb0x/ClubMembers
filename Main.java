import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        ArrayList<MemberInfo> members = new ArrayList<>();
        ClubMembers club = new ClubMembers(members);

    
        members.add(new MemberInfo("Jane Smith", 2019 , false));
        members.add(new MemberInfo("Steve Fox", 2018 , true));
        members.add(new MemberInfo("Micheal Xin", 2017 , false));
        members.add(new MemberInfo("Maria Garcia", 2020 , true));

        club.GetList();
        System.out.println();
        club.removeMembers(2018);
        
    









    }
}