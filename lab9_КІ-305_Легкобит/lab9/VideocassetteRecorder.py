from VideoPlayer import VideoPlayer
from lab9.Videocassette import Videocassette


class VideocassetteRecorder(VideoPlayer, Videocassette):
    def __init__(self, screen, hard_disk, cassette_type):
        super().__init__(screen, hard_disk)
        self.cassette_type = cassette_type

    def insert_cassette(self):
        print(f"Inserting {self.cassette_type} cassette into the videocassette recorder")

    def get_size(self):
        print(f"Videocassette size {self.size}")

    def eject_cassette(self):
        print(f"Ejecting {self.cassette_type} cassette from the videocassette recorder")

    def record_video_to_cassette(self, video):
        print(f"Recording video to {self.cassette_type} cassette: {video}")
