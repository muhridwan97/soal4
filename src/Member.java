public class Member {
    private String nama;
    private String team;
    private int umur;
    private int nilaiPenampilan;
    private int nilaiSuara;
    private int nilaiAtitude;
    
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setTeam (String team){
        this.team = team;
    }
    public void setUmur (int umur){
        this.umur = umur;
    }
    public void setPenampilan (int penampilan){
        this.nilaiPenampilan = penampilan;
    }
    public void setSuara (int suara){
        this.nilaiSuara = suara;
    }
    public void setAtitude (int atitude){
        this.nilaiAtitude = atitude;
    }
    public String getNama (){
        return nama;
    }
    public String getTeam (){
        return team;
    }
    public int getUmur (){
        return umur;
    }
    public int getNilai(){
        return (nilaiPenampilan+nilaiSuara+nilaiAtitude)/3;
    }
    
}
