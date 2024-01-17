package com.xworkz.policestationapp.policestation.impl;

import com.xworkz.policestationapp.OfficersIdNotFoundException;
import com.xworkz.policestationapp.exception.OfficerNameNotFoundException;
import com.xworkz.policestationapp.exception.OfficersNotFoundException;
import com.xworkz.policestationapp.exception.PostNameNotFoundException;
import com.xworkz.policestationapp.officers.Officers;
import com.xworkz.policestationapp.policestation.PoliceStation;

import java.util.ArrayList;
import java.util.List;

public class OfficersImpl implements PoliceStation {
    List<Officers> list = new ArrayList<>();
    //    Officers officers[] ;
    public OfficersImpl(){
//
//        officers=new Officers[size];
    }
    int index = 0;
    int id;

    @Override
    public boolean addOfficers(Officers officers) {
        System.out.println("Invoking Add Officers Method");
        boolean isAdded = false;
        if (officers != null) {
            officers.setOfficersId(id++);
            this.list.add(officers);
            isAdded = true;
            System.out.println("Officers Added Into The PoliceStation Successfully");
        }
        try {
            if (isAdded == false) {
                OfficersNotFoundException officersNotFoundException =
                        new OfficersNotFoundException("");
                throw officersNotFoundException;
            }
        } catch (Exception e) {
            System.out.println("Added officers not found");
        }
        return isAdded;
    }

    @Override
    public void getAddOfficers() {
//        for (int index = 0; index < officers.length; index++) {
//            System.out.println(officers[index].getOfficersId() + " " + officers[index].getOfficersName() + " " + officers[index].getOfficersAge() + " " + officers[index].getOfficersPostName() + " " + officers[index].getBloodGroup() + " " + officers[index].getOfficersGender() + " " + officers[index].getOfficersAddress());
//        }
        for (Officers off : list) {
            System.out.println(off);
        }
    }

    public String getOfficerNameByPostName(String postName) {
        System.out.println("Invoking Get Officer Name By PostName Method");
        String officer = null;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersPostName().equals(postName)) {
//                officer=officers[index].getOfficersName();
//                System.out.println("Officer Name Found By Using Post Name");
//            }
//        }
        for (Officers offi : list) {

        }
        try {
            if (officer == null) {
                PostNameNotFoundException postNameNotFoundException =
                        new PostNameNotFoundException("");
                throw postNameNotFoundException;
            }
        } catch (Exception e) {
            System.out.println("Post Name Miss Matched");
        }
        return officer;
    }

    public String getAddressByOfficersId(int id) {
        System.out.println("Invoking get Address By OfficersId Method");
        String officer = null;
//           for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersId() == id) {
//                officer = officers[index].getOfficersAddress();
//                System.out.println("Officer Address Found By Using Officer Id");
//            }
//       }
        for (Officers offi : list) {
            if (offi.getOfficersId() == id) {
                officer = offi.getOfficersAddress();
            }
        }
        try {
            if (officer == null) {
                OfficersIdNotFoundException officersIdNotFoundException =
                        new OfficersIdNotFoundException("");
                throw officersIdNotFoundException;
            }
        } catch (Exception e) {
            System.out.println("provided id is wrong");
        }
        return officer;
    }

    public int getOfficersAgeByName(String name) {
        System.out.println("Invoking get Officers Age By Name Method");
        int officer = 0;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersName().equals(name)) {
//                officer=officers[index].getOfficersAge();
//                System.out.println("Officer Address Found By Using Officer Id");
//            }
//        }
        for (Officers offi : list) {
            if (offi.getOfficersName() == name) {
                officer = offi.getOfficersAge();
            }
        }
        try {
            if (officer == 0) {
                OfficerNameNotFoundException officerNameNotFoundException =
                        new OfficerNameNotFoundException("");
                throw officerNameNotFoundException;
            }
        } catch (Exception e) {
            System.out.println("Officer name is wrong");
        }
        return officer;
    }

    public Officers getOfficersInfoById(int id) {
        System.out.println("Invoking get Officers Info By Id Method");

        Officers officer = null;
//        for (int index = 0; index < officers.length; index++) {
//            if (officers[index].getOfficersId() == id) {
//                officer=officers[index];
//                System.out.println("Officer Info Found By Using Officer Id");
//            }
//        }
        for (Officers offi : list) {
            if (offi.getOfficersId() == id) {
                officer = officer;
            }
        }
        try {
            if (officer == null) {
                OfficersIdNotFoundException officersIdNotFoundException =
                        new OfficersIdNotFoundException("");
                throw officersIdNotFoundException;
            }
        } catch (Exception e) {
            System.out.println("id is wrong");
        }
        return officer;
    }
}
