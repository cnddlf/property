package com.jin.AptInfra;

//아파트_주변인프라 
public class AptInfra {

 // 아파트 번호 
 private String aptnum;

 // 소아과 개수 
 private Integer pediatrics;

 // 큰병원 최소거리 
 private Float generalHospital;

 // 일반 병원 개수 
 private Integer hospital;

 // 동물병원 개수 
 private Integer animalHospital;

 // 경찰서 개수 
 private Integer policeoffice;

 // 유치원 개수 
 private Integer kindergarden;

 // 초등학교 최소거리 
 private Float elementarySchool;

 // 중고등학교 최소거리 
 private Float secondarySchool;

 // 공원 최소거리 
 private Float park;

 // 지하철 최소거리 
 private Float subway;

 // 대형마트 최소거리 
 private Float supermarket;

 // 맥도날드 최소거리 
 private Float mcdonald;

 // 맘스터치 최소거리 
 private Float momstouch;

 // 스타벅스 최소거리 
 private Float starbucks;

 public String getAptnum() {
     return aptnum;
 }

 public void setAptnum(String aptnum) {
     this.aptnum = aptnum;
 }

 public Integer getPediatrics() {
     return pediatrics;
 }

 public void setPediatrics(Integer pediatrics) {
     this.pediatrics = pediatrics;
 }

 public Float getGeneralHospital() {
     return generalHospital;
 }

 public void setGeneralHospital(Float generalHospital) {
     this.generalHospital = generalHospital;
 }

 public Integer getHospital() {
     return hospital;
 }

 public void setHospital(Integer hospital) {
     this.hospital = hospital;
 }

 public Integer getAnimalHospital() {
     return animalHospital;
 }

 public void setAnimalHospital(Integer animalHospital) {
     this.animalHospital = animalHospital;
 }

 public Integer getPoliceoffice() {
     return policeoffice;
 }

 public void setPoliceoffice(Integer policeoffice) {
     this.policeoffice = policeoffice;
 }

 public Integer getKindergarden() {
     return kindergarden;
 }

 public void setKindergarden(Integer kindergarden) {
     this.kindergarden = kindergarden;
 }

 public Float getElementarySchool() {
     return elementarySchool;
 }

 public void setElementarySchool(Float elementarySchool) {
     this.elementarySchool = elementarySchool;
 }

 public Float getSecondarySchool() {
     return secondarySchool;
 }

 public void setSecondarySchool(Float secondarySchool) {
     this.secondarySchool = secondarySchool;
 }

 public Float getPark() {
     return park;
 }

 public void setPark(Float park) {
     this.park = park;
 }

 public Float getSubway() {
     return subway;
 }

 public void setSubway(Float subway) {
     this.subway = subway;
 }

 public Float getSupermarket() {
     return supermarket;
 }

 public void setSupermarket(Float supermarket) {
     this.supermarket = supermarket;
 }

 public Float getMcdonald() {
     return mcdonald;
 }

 public void setMcdonald(Float mcdonald) {
     this.mcdonald = mcdonald;
 }

 public Float getMomstouch() {
     return momstouch;
 }

 public void setMomstouch(Float momstouch) {
     this.momstouch = momstouch;
 }

 public Float getStarbucks() {
     return starbucks;
 }

 public void setStarbucks(Float starbucks) {
     this.starbucks = starbucks;
 }

 // AptInfra 모델 복사
 public void CopyData(AptInfra param)
 {
     this.aptnum = param.getAptnum();
     this.pediatrics = param.getPediatrics();
     this.generalHospital = param.getGeneralHospital();
     this.hospital = param.getHospital();
     this.animalHospital = param.getAnimalHospital();
     this.policeoffice = param.getPoliceoffice();
     this.kindergarden = param.getKindergarden();
     this.elementarySchool = param.getElementarySchool();
     this.secondarySchool = param.getSecondarySchool();
     this.park = param.getPark();
     this.subway = param.getSubway();
     this.supermarket = param.getSupermarket();
     this.mcdonald = param.getMcdonald();
     this.momstouch = param.getMomstouch();
     this.starbucks = param.getStarbucks();
 }
}