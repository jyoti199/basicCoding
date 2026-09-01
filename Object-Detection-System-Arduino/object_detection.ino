const int sensorPin = 7;
const int ledPin = 8;
const int buzzerPin = 9;

void setup()
{
  Serial.begin(9600);
  pinMode(ledPin, OUTPUT);
  pinMode(buzzerPin, OUTPUT);
}

void loop()
{
  pinMode(sensorPin, OUTPUT);

  digitalWrite(sensorPin, LOW);
  delayMicroseconds(2);

  digitalWrite(sensorPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(sensorPin, LOW);

  pinMode(sensorPin, INPUT);

  long duration = pulseIn(sensorPin, HIGH);
  float distance = duration * 0.0343 / 2;

  Serial.print("Distance: ");
  Serial.println(distance);

  if (distance <= 20)
  {
    digitalWrite(ledPin, HIGH);
    tone(buzzerPin, 1000);
  }
  else
  {
    digitalWrite(ledPin, LOW);
    noTone(buzzerPin);
  }

  delay(500);
}
