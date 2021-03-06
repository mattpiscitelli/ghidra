/* ###
 * IP: GHIDRA
 * REVIEWED: YES
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.feature.vt.api.main;

public enum VTMarkupItemDestinationAddressEditStatus {

	EDITABLE("This item's destination address is editable."),

	UNEDITABLE_FUNCTION_ENTRY_POINT("This item's destination address is based on the "
		+ "function's entry point and can't be edited."),

	UNEDITABLE_DATA_ADDRESS("This item's destination address is based on the "
		+ "address of data and can't be edited."),

	UNEDITABLE_UNAPPLIABLE_ASSOCIATION_STATUS("This markup item's Match status prevents its "
		+ "destination address from being edited."),

	UNEDITABLE_UNAPPLIABLE_MARKUP_STATUS("This markup item's status prevents its "
		+ "destination address from being edited.");

	private String description;

	private VTMarkupItemDestinationAddressEditStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return name() + ": " + description;
	}
}
