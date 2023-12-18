class Button:
    def __init__(self, action):
        self.action = action

    @property
    def get_action(self):
        return self.action

    @property
    def set_action(self, action):
        self.action = action

    def __str__(self):
        return f'Button{{ action=\'{self.action}\'}}'
