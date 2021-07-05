import math


class circle:
    radius = 0

    def __init__(self):
        self.radius = self.inputRadius()

    def inputRadius(self):
        while 1:
            try:
                self.radius = float(input("RADIUS: "))
                if self.radius < 0:
                    raise ValueError("That is not a positive number!")
                break
            except ValueError:
                self.radius = float(input("RADIUS: "))

    def CircleArea(self):
        area = math.pi * self.radius ** 2
        return area

    def CircleCircuit(self):
        circuit = 2 * math.pi * self.radius
        return circuit

class triangle:
    sideA = 0
    sideB = 0
    sideC = 0

    def __init__(self):
        self.sideA = self.inputSide()
        self.sideB = self.inputSide()
        self.sideC = self.inputSide()

    def inputSide(self):
        while 1:
            try:
                self.sideA = float(input("SIDE: "))
                self.sideB = float(input("SIDE: "))
                self.sideC = float(input("SIDE: "))
                if self.sideA < 0 or self.sideC < 0 or self.sideB < 0 :
                    raise ValueError("That is not a positive number!")
                break
            except ValueError:
                self.sideA = float(input("SIDE: "))
                self.sideB = float(input("SIDE: "))
                self.sideC = float(input("SIDE: "))

    def sideCheck(self):
        if (self.sideA + self.sideB > self.sideC) and (self.sideB + self.sideC > self.sideA) and (
                self.sideA + self.sideC > self.sideB):
            return True
        else:
            print("WRONG DATA")
            return False

    def triangleAreaHeron(self, sideA, sideB, sideC):
        p = (sideA + sideB + sideC) / 2
        areaHeron = math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC))
        return areaHeron

    def triangleCircuit(self, sideA, sideB, sideC):
        circuit = sideA + sideB + sideC
        return circuit


class square:
    side = 0

    def __init__(self):
        self.side = self.inputSide()

    def inputSide(self):
        while 1:
            try:
                self.side = float(input("SIDE: "))
                if self.side < 0:
                    raise ValueError("That is not a positive number!")
                break
            except ValueError:
                self.side = float(input("SIDE: "))

    def squareArea(self, a):
        area = a * a
        return area

    def squareCircuit(self, a):
        circuit = 4 * a
        return circuit
