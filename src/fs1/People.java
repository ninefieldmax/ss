package fs1;

public class  People {
    public String name;
    public String sex;
    public String tel;
        public  static void ff(People a[]){
            People p1=new People();
            People p2=new People();
            People p3=new People();
            People p4=new People();
            p1.name="玛妮";p1.sex="🚹";p1.tel="19999";
            p2.name="莱咔";p2.sex="🚹";p2.tel="21312321";
            p3.name="牛博";p3.sex="🚹";p3.tel="21321232";
            p4.name="家驹";p4.sex="🚺";p4.tel="89763857";
            a[0]=p1;
            a[1]=p2;
            a[2]=p3;
            a[3]=p4;
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
