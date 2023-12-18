from Screen import Screen
from HardDisk import HardDisk
from VideocassetteRecorder import VideocassetteRecorder

def main():
    screen_instance = Screen(7.8, "720x1980")
    hard_disk_instance = HardDisk(1000, "Harman")

    vcr_instance = VideocassetteRecorder(screen_instance, hard_disk_instance, "VHS")

    vcr_instance.add_video("My birthday video")
    vcr_instance.add_video("First time in France")
    vcr_instance.add_video("Lviv")
    vcr_instance.add_video("Party")
    vcr_instance.add_video("Karate competition")

    vcr_instance.turn_on_next_video()
    vcr_instance.turn_on_next_video()
    vcr_instance.turn_on_next_video()

    vcr_instance.turn_on_prev_video()
    vcr_instance.turn_on_prev_video()
    vcr_instance.turn_on_prev_video()
    vcr_instance.turn_on_prev_video()

    print(vcr_instance)

if __name__ == "__main__":
    main()
