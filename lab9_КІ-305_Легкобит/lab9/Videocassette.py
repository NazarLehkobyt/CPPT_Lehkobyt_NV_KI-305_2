class Videocassette:
    def init(self, size):
        self.size = size

    @property
    def get_size(self):
        return self.size