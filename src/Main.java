import java.util.ArrayList;

public class Main {

    public static ArrayList<Member> list = new ArrayList<>();

    public static void main(String[] args) {
        
        Member user = new Member();
        Member user2 = new Member();
        Member user3 = new Member();
        user.setNama("Ridwan");
        user.setTeam("UBTV");
        user.setUmur(18);
        user.setAtitude(80);
        user.setPenampilan(70);
        user.setSuara(100);

        user2.setNama("Ari");
        user2.setTeam("Manor");
        user2.setUmur(19);
        user2.setAtitude(80);
        user2.setPenampilan(70);
        user2.setSuara(60);

        user3.setNama("Rasio");
        user3.setTeam("Persik");
        user3.setUmur(30);
        user3.setAtitude(70);
        user3.setPenampilan(80);
        user3.setSuara(50);

        list.add(user);
        list.add(user2);
        list.add(user3);
        tampilan();

    }

    public static void tampilan() {
        System.out.println("---------Daftar Member---------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nama  : " + list.get(i).getNama());
            System.out.println("Team  : " + list.get(i).getTeam());
            System.out.println("Umur  : " + list.get(i).getUmur());
            System.out.println("Nilai : " + list.get(i).getNilai());
            System.out.println("-------------------------------");
        }

    }
}
