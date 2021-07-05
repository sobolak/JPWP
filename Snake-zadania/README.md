
# Zadanie 1
Uzupełnij funkcję start()
* Dodaj cukierka
* Ustaw wartośc zmiennej running tak, aby gra się rozpoczęła
* Utwórz obiekt klasy timer i uruchom go

# Zadanie 2
Klasa MyKeyAdapter rozszerza klasę KeyAdapter i nadpisuje metodę keyPressed(KeyEvent e) służacą do przechwytywania znaków z klawiatury. Uzupełnij zawartość tej metody. 
* Odczytaj ze zdarzenia jaki klawisz został naciśnięty
* Ustaw odpowiedni kierunek poruszania się węża w zależności od tego, która ze strzałek została naciśnięta
* Pamiętaj aby uwzlędnić to, że kierunek nie może się zmienić na przeciwny - czyli np. jeżeli wąż porusza się w prawo to nie może nagle zacząć poruszać się w lewo

Uzupełnij również metodę move(). Aby to zrobić:
* Stwórz pętlę for wykorzystując zmienną body_parts, w której zdefiniujesz położenie każdego elementu węża na podstawie elementu go poprzedzającego (tablice x[] oraz y[] przechowują dane określające położenie części ciała węża)
* Za pomocą instrukcji wyboru (switch) oraz zmiennej direction określ sposób poruszania się węża

# Zadanie 3
Dorysuj nóżki pajączkowi oraz utwórz animację, tak aby oczka poruszały się na przemian w prawo i lewo. 


![pajączek](https://github.com/nurbanek/Snake-zadania/blob/main/pajaczek.gif)
