import math
import os
import struct

class CalculateTheEquationInterface:
    def do_calculation(self):
        pass

class ReadWriteData:
    def write_result_to_txt(self, file_name):
        pass

    def write_result_to_bin(self, file_name):
        pass

    def read_result_from_txt(self, file_name):
        pass

    def read_result_from_bin(self, file_name):
        pass

class CalculateTheEquation(CalculateTheEquationInterface, ReadWriteData):
    def __init__(self, variable):
        self.variable = variable

    def do_calculation(self):
        try:
            self.variable = (self.variable - 4) / math.sin(3 * self.variable - 1)
            return self.variable
        except ArithmeticError as e:
            print("Arithmetic exception: illegal value.")
            return 0

    def write_result_to_txt(self, file_name):
        with open(file_name, 'w') as f:
            f.write(f"{self.variable} ")

    def write_result_to_bin(self, file_name):
        with open(file_name, 'wb') as f:
            f.write(struct.pack('d', self.variable))

    def read_result_from_txt(self, file_name):
        if os.path.exists(file_name):
            with open(file_name, 'r') as f:
                self.variable = float(f.read())
                return self.variable
        else:
            raise IOError(f"File {file_name} not found")

    def read_result_from_bin(self, file_name):
        if os.path.exists(file_name):
            with open(file_name, 'rb') as f:
                self.variable = struct.unpack('d', f.read(8))[0]
                return self.variable
        else:
            raise IOError(f"File {file_name} not found")

if __name__ == "__main__":
    calc = CalculateTheEquation(2.1)
    print("Result of calculation:", calc.do_calculation())

    x = 14
    try:
        with open("array.txt", 'w') as f:
            f.write(f"{x} ")
        calc.write_result_to_bin("bin.bin")
        print("Result from bin:", calc.read_result_from_bin("bin.bin"))
    except IOError as e:
        print(e)

    try:
        calc.write_result_to_txt("txt.txt")
        print("Result from txt:", calc.read_result_from_txt("txt.txt"))
    except IOError as e:
        print(e)
