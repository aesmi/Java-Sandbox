public class Team {
    Member member;
    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args){
        Member myMember = new Member("Fischl", "Electro", 60);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
    }
}

class Member {
    private String name;
    private String type;
    private int level;

    public Member(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    public String getName() { // what is your name?
        return this.name; // my name is ...
    }
       
    public String getType() { // what is your type?
        return this.type; // my type is ...
    }
       
    public int getLevel() { // what is your level?
        return this.level; // my level is ...
    }      
}