package com.jin.AptInfo;

//����Ʈ ���� 
public class AptInfo {

 // ����Ʈ ��ȣ 
 private String aptnum;

 // ����Ʈ ���� 
 private String aptinfo;

 // ����Ʈ �ּ� 
 private String aptaddress;

 // ����Ʈ ���� 
 private String aptlatitude;

 // ����Ʈ �浵 
 private String aptlongtitude;

 public String getAptnum() {
     return aptnum;
 }

 public void setAptnum(String aptnum) {
     this.aptnum = aptnum;
 }

 public String getAptinfo() {
     return aptinfo;
 }

 public void setAptinfo(String aptinfo) {
     this.aptinfo = aptinfo;
 }

 public String getAptaddress() {
     return aptaddress;
 }

 public void setAptaddress(String aptaddress) {
     this.aptaddress = aptaddress;
 }

 public String getAptlatitude() {
     return aptlatitude;
 }

 public void setAptlatitude(String aptlatitude) {
     this.aptlatitude = aptlatitude;
 }

 public String getAptlongtitude() {
     return aptlongtitude;
 }

 public void setAptlongtitude(String aptlongtitude) {
     this.aptlongtitude = aptlongtitude;
 }

 // AptInfo �� ����
 public void CopyData(AptInfo param)
 {
     this.aptnum = param.getAptnum();
     this.aptinfo = param.getAptinfo();
     this.aptaddress = param.getAptaddress();
     this.aptlatitude = param.getAptlatitude();
     this.aptlongtitude = param.getAptlongtitude();
 }
}
