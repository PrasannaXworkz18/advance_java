package com.xworkz.policestationapp.officers;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Officers{
    private int officersId;
    private  String officersName;
    private int officersAge;
    private String officersPostName;
    private String bloodGroup;
    private String officersGender;
    private  String officersAddress;
}