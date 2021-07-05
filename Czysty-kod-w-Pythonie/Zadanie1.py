def generate_prime_numbers(q):
    """Funkcja tworząca listę liczb pierwszych z podanego zakresu."""
    y=[1*x for x in range(q + 1)]


    x=[]

    for cybant in range(2,q+1): #sprawdzam czy miesci sie w limicie



        if y[cybant] != 0:




            x.append(cybant) #dodaje do liczb pierwszych
            for j in range(cybant+cybant,q+1,cybant):
                y[j]=0 #daje 0 ale nie zeby nie dodal



    return x

def generate_fibonacci_numbers(cybant):
    """Funkcja generująca podaną ilość liczb ciągu Fibonacciego."""

    x = [0]

    if cybant == 1:


        x.append(1)
        return x
    q = 0

    y = 1

    for i in range(cybant-1): #kolejny numer
        y += q

        q = y - q # odejmowanie
        x.append(y) #dodawanie do listy y
    return x