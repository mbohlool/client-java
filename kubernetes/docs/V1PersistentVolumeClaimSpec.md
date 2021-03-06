
# V1PersistentVolumeClaimSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains the desired access modes the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1 |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) | Resources represents the minimum resources the volume should have. More info: http://kubernetes.io/docs/user-guide/persistent-volumes#resources |  [optional]
**selector** | [**UnversionedLabelSelector**](UnversionedLabelSelector.md) | A label query over volumes to consider for binding. |  [optional]
**volumeName** | **String** | VolumeName is the binding reference to the PersistentVolume backing this claim. |  [optional]



