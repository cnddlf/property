package com.jin.AptInfra;

//����Ʈ_�ֺ������� 
public class AptInfra {

 // ����Ʈ ��ȣ 
 private String aptnum;

 // �Ҿư� ���� 
 private Integer pediatrics;

 // ū���� �ּҰŸ� 
 private Float generalHospital;

 // �Ϲ� ���� ���� 
 private Integer hospital;

 // �������� ���� 
 private Integer animalHospital;

 // ������ ���� 
 private Integer policeoffice;

 // ��ġ�� ���� 
 private Integer kindergarden;

 // �ʵ��б� �ּҰŸ� 
 private Float elementarySchool;

 // �߰���б� �ּҰŸ� 
 private Float secondarySchool;

 // ���� �ּҰŸ� 
 private Float park;

 // ����ö �ּҰŸ� 
 private Float subway;

 // ������Ʈ �ּҰŸ� 
 private Float supermarket;

 // �Ƶ����� �ּҰŸ� 
 private Float mcdonald;

 // ������ġ �ּҰŸ� 
 private Float momstouch;

 // ��Ÿ���� �ּҰŸ� 
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

 // AptInfra �� ����
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