package com.jin.AptInfo;

//아파트 정보 
public class AptInfo {

 // 아파트 번호 
 private String aptnum;

 // 아파트 정보 
 private String aptinfo;

 // 아파트 주소 
 private String aptaddress;

 // 아파트 위도 
 private String aptlatitude;

 // 아파트 경도 
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

 // AptInfo 모델 복사
 public void CopyData(AptInfo param)
 {
     this.aptnum = param.getAptnum();
     this.aptinfo = param.getAptinfo();
     this.aptaddress = param.getAptaddress();
     this.aptlatitude = param.getAptlatitude();
     this.aptlongtitude = param.getAptlongtitude();
 }
}
