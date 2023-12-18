class HardDisk:
    def __init__(self, capacity, producer):
        self.capacity = capacity
        self.producer = producer

    @property
    def get_capacity(self):
        return self.capacity

    @property
    def get_producer(self):
        return self.producer

    @property
    def set_capacity(self, capacity):
        self.capacity = capacity

    @property
    def set_producer(self, producer):
        self.producer = producer

    def __str__(self):
        return "HardDisk{ " + "capacity = " + str(self.capacity) + " mb." + ", producer = '" + self.producer + '\'' + '}'
