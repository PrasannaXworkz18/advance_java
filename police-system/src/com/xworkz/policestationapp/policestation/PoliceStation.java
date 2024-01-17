package com.xworkz.policestationapp.policestation;


import com.xworkz.policestationapp.officers.Officers;

public interface PoliceStation {

      int dummy=19;

//    Officers officers[] ;
//    public PoliceStation(int size){
//        officers=new Officers[size];
//    }
//    int index = 0;
//    int id;
//    public boolean addOfficers( );// {
//        System.out.println("Invoking Add Officers Method");
//        boolean isAdded = false;
//        if (officers != null) {
//            officers.setOfficersId(id++);
//            this.officers[index++] = officers;
//            isAdded = true;
//            System.out.println("Officers Added Into The PoliceStation Successfully");
//        }
//        return isAdded;
    //}

   public boolean addOfficers(Officers officers);

    public void getAddOfficers(); //{
//        for (int index = 0; index < officers.length; index++) {
//            System.out.println(officers[index].getOfficersId() + " " + officers[index].getOfficersName() + " " + officers[index].getOfficersAge() + " " + officers[index].getOfficersPostName() + " " + officers[index].getBloodGroup() + " " + officers[index].getOfficersGender() + " " + officers[index].getOfficersAddress());
//        }
//    }
//

    public String getOfficerNameByPostName(String postName);//{
//        System.out.println("Invoking Get Officer Name By PostName Method");
//        String officer =null;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersPostName().equals(postName)) {
//                officer=officers[index].getOfficersName();
//                System.out.println("Officer Name Found By Using Post Name");
//            }
//        }
//           return officer;
//    }
//
      public String getAddressByOfficersId(int id);//{
//        System.out.println("Invoking get Address By OfficersId Method");
//        String officer =null;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersId() == id) {
//                officer=officers[index].getOfficersAddress();
//                System.out.println("Officer Address Found By Using Officer Id");
//            }
//        }
//        return officer;
//    }
//
//
      public int getOfficersAgeByName(String name);//{
//        System.out.println("Invoking get Officers Age By Name Method");
//        int officer =0;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersName().equals(name)) {
//                officer=officers[index].getOfficersAge();
//                System.out.println("Officer Address Found By Using Officer Id");
//            }
//        }
//        return officer;
//    }
//
      public Officers getOfficersInfoById(int id);//{
//        System.out.println("Invoking get Officers Info By Id Method");
//        Officers officer =null;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersId() == id) {
//                officer=officers[index];
//                System.out.println("Officer Info Found By Using Officer Id");
//            }
//        }
//        return officer;
//    }
//


}
