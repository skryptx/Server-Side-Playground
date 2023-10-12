""" this module prints name that is input from command line """
import sys


def main():
    print(f"My name is {sys.argv[1]} and script name is {sys.argv[0]}")


if __name__ == "__main__":
    main()
