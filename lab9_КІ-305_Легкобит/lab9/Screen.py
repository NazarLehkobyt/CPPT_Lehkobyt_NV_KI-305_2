class Screen:
    def __init__(self, diagonal, expansion):
        self.diagonal = diagonal
        self.expansion = expansion

    @property
    def get_diagonal(self):
        return self.diagonal

    @property
    def get_expansion(self):
        return self.expansion

    @property
    def set_diagonal(self, diagonal):
        self.diagonal = diagonal

    @property
    def set_expansion(self, expansion):
        self.expansion = expansion

    def __str__(self):
        return f'Screen{{ diagonal = {self.diagonal}, expansion = \'{self.expansion}\'}}'
