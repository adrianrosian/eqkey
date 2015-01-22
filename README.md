# eqey

equivalent key generation using the `eqvkey` library

## Installation

Download jar from the target folder

## Usage

    $ java -jar eqey-0.1.0-standalone.jar [args]

## Options

the program accepts 2 params: the string and the threshold (int)

## Examples

	$ java -jar eqey-0.1.0-standalone.jar ["my test key" 3]

this generates teh equivalent key where every sequence of 1 or 0s longer than 3 will trigger a bit inversion

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
