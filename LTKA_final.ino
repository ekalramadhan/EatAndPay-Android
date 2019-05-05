#include <Servo.h>
#include <ArduinoJson.h>
#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>

#define WIFI_SSID "Raden Miftah's"             //wifi username
#define WIFI_PASSWORD "lalawee007"          //wifi password

#define FIREBASE_HOST "eatandpay-android2.firebaseio.com"        //link of api 
#define FIREBASE_AUTH "H4EdibIAOROCVIAea74jWxAXfWwunCmNDdx8iEIe" //database secret

int posisiServo;

Servo servo;

void setup() {
  servo.attach(D4);  //pin D4


Serial.begin(115200);
// connect wifi.
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.print("connecting");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
  Serial.println();
  Serial.print("connected: ");
  Serial.println(WiFi.localIP());
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);

  servo.write(180);
  delay(15000);
  servo.write(90);
}

void loop() {
//kondisi awal 
  posisiServo= Firebase.getInt("SERVO/HIGH");
  while (posisiServo==0) {
  servo.write(180);
  Serial.println(posisiServo);
  delay(1000);
  posisiServo= Firebase.getInt("SERVO/HIGH");
  }
//ketika ada masukan data dari android
  while (posisiServo == 1) {
  servo.write(90);
  Serial.println(posisiServo);
  delay(10000);
  Firebase.setInt("SERVO/HIGH", 0);
  servo.write(180);
  posisiServo= Firebase.getInt("SERVO/HIGH");
  Serial.println(posisiServo);
  delay(1000);
  }
}
