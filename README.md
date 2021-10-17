Design a logger library which prints log messages synchronously or asynchronously to different targets(such as file, database, some url) based on log level (debug, info, error,warn).One target can be tied to multiple log levels.The logger has to read configuration file during system startup and initialize.
Configuration can look like
{
target:​ ​db,
loglevel:​ ​info,
endpoint:​ ​localhost,
Port:3306,
timestampformat:​ ​"dd-mm-yy"
},
{
target:​ file,
loglevel:​ debug,
filelocation:​ ​/var/lib/sample.log,
timestampformat:​ ​"dd-mm-yy"
}

	Printed logs will contain string content, log level, name of application which generated
the logs.