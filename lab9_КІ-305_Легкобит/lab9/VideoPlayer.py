from Button import Button
import logging

class VideoPlayer:
    def __init__(self, screen, hard_disk):
        self.next_video = Button("next video")
        self.prev_video = Button("prev video")
        self.pause = Button("pause")
        self.logger = logging.getLogger("logs.txt")
        self.screen = screen
        self.hard_disk = hard_disk
        self.videos = []
        self.cur_video = 0

        self.logger.info("VideoPlayer constructor called")

    def add_video(self, video):
        self.videos.append(video)
        print(f"{video} was added to video player")
        self.logger.info("VideoPlayer add_video method was called")

    def turn_on_next_video(self):
        self.logger.info("turn_on_next_video VideoPlayer method was called")
        if self.cur_video == len(self.videos) - 1:
            print(f"You push button {self.next_video.get_action}")
            print(f"Now showing {self.videos[self.cur_video]}")
            self.cur_video = 0
        elif 0 <= self.cur_video < len(self.videos) - 1:
            print(f"You push button {self.next_video.get_action}")
            print(f"Now showing {self.videos[self.cur_video]}")
            self.cur_video += 1

    def turn_on_prev_video(self):
        self.logger.info("turn_on_prev_video VideoPlayer method was called")
        if self.cur_video == 0:
            print(f"You push button {self.prev_video.get_action}")
            print(f"Now showing {self.videos[self.cur_video]}")
            self.cur_video = len(self.videos) - 1
        elif 0 < self.cur_video <= len(self.videos) - 1:
            print(f"You push button {self.prev_video.get_action}")
            print(f"Now showing {self.videos[self.cur_video]}")
            self.cur_video -= 1

    def __str__(self):
        return f'VideoPlayer{{ screen={self.screen}, hard_disk={self.hard_disk}, videos={self.videos}, cur_video={self.cur_video}}}'


