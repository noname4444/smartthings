/**
 *  Simple Manual Scene Switch
 *
 *  Copyright 2015 Jim Worley
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "Simple Manual Scene Switch", namespace: "noname4444", author: "Jim Worley") {
		capability "Switch"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		standardTile("button", "device.switch", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true) {
			state "off", label: 'Press', action: "switch.on", icon: "st.illuminance.illuminance.dark", backgroundColor: "#79b821" 
			state "on", label: 'Press', action: "switch.off", icon: "st.illuminance.illuminance.dark", backgroundColor: "#79b821" 
        }
		main "button"
		details "button"
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'switch' attribute

}

// handle commands
def on() {
	log.debug "Simple Manual Scene ${device.displayName}:on"
	return sendEvent(name: "switch", value: "on", data: "~on~")
}

def off() {
	log.debug "Simple Manual Scene ${device.displayName}:off"
	return sendEvent(name: "switch", value: "off", data: "~off~")
}