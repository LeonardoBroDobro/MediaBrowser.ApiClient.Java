package mediabrowser.model.notifications;

public enum NotificationType
{
	ApplicationUpdateAvailable,
	ApplicationUpdateInstalled,
	AudioPlayback,
	GamePlayback,
	VideoPlayback,
	AudioPlaybackStopped,
	GamePlaybackStopped,
	VideoPlaybackStopped,
	InstallationFailed,
	PluginError,
	PluginInstalled,
	PluginUpdateInstalled,
	PluginUninstalled,
	NewLibraryContent,
	NewLibraryContentMultiple,
	ServerRestartRequired,
	TaskFailed,
	CameraImageUploaded,
	UserLockedOut;

	public int getValue()
	{
		return this.ordinal();
	}

	public static NotificationType forValue(int value)
	{
		return values()[value];
	}
}