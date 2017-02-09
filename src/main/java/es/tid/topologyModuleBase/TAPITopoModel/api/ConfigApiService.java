package es.tid.TopologyModuleBase.TAPITopoModel.api;

import es.tid.TopologyModuleBase.TAPITopoModel.api.*;
import es.tid.TopologyModuleBase.TAPITopoModel.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import es.tid.TopologyModuleBase.TAPITopoModel.model.ContextSchema;
import es.tid.TopologyModuleBase.TAPITopoModel.model.NameAndValue;
import es.tid.TopologyModuleBase.TAPITopoModel.model.NetworkTopologyService;
import es.tid.TopologyModuleBase.TAPITopoModel.model.LayerProtocol;
import es.tid.TopologyModuleBase.TAPITopoModel.model.ServiceEndPoint;
import es.tid.TopologyModuleBase.TAPITopoModel.model.LifecycleStatePac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.Link;
import es.tid.TopologyModuleBase.TAPITopoModel.model.LayerProtocolTransitionPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.RiskCharacteristic;
import es.tid.TopologyModuleBase.TAPITopoModel.model.RiskParameterPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.AdminStatePac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.Capacity;
import es.tid.TopologyModuleBase.TAPITopoModel.model.TransferCapacityPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.CostCharacteristic;
import es.tid.TopologyModuleBase.TAPITopoModel.model.TransferCostPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.TransferIntegrityPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.LatencyCharacteristic;
import es.tid.TopologyModuleBase.TAPITopoModel.model.TransferTimingPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.ValidationPac;
import es.tid.TopologyModuleBase.TAPITopoModel.model.ValidationMechanism;
import es.tid.TopologyModuleBase.TAPITopoModel.model.Node;
import es.tid.TopologyModuleBase.TAPITopoModel.model.NodeEdgePoint;
import es.tid.TopologyModuleBase.TAPITopoModel.model.Topology;

import java.util.List;
import es.tid.TopologyModuleBase.TAPITopoModel.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-09T12:50:28.288+01:00")
public abstract class ConfigApiService {
    public abstract Response createContextById(ContextSchema context,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createContextLabelLabelById(String valueName,NameAndValue label,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createContextNameNameById(String valueName,NameAndValue name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteContextById(SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteContextLabelLabelById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteContextNameNameById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContext(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextLabelLabel(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextLabelLabelById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNameName(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNameNameById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNwTopologyServiceLabelLabel(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNwTopologyServiceLabelLabelById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNwTopologyServiceNameName(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNwTopologyServiceNameNameById(String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextNwTopologyServiceNwTopologyService(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLabelLabel(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLabelLabelById(String uuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLayerProtocolLayerProtocol(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLayerProtocolLayerProtocolById(String uuid,String localId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLayerProtocolNameName(String uuid,String localId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointLayerProtocolNameNameById(String uuid,String localId,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointNameName(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointNameNameById(String uuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointServiceEndPoint(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointServiceEndPointById(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextServiceEndPointStateState(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLabelLabel(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLabelLabelById(String uuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkLabelLabel(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkLabelLabelById(String uuid,String linkUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkLink(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkLinkById(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkLpTransitionLpTransition(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkNameName(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkNameNameById(String uuid,String linkUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkRiskParameterRiskCharacteristicRiskCharacteristic(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkRiskParameterRiskCharacteristicRiskCharacteristicById(String uuid,String linkUuid,String riskCharacteristicName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkRiskParameterRiskParameter(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkStateState(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCapacityAvailableCapacityAvailableCapacity(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCapacityCapacityAssignedToUserViewCapacityAssignedToUserView(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCapacityCapacityAssignedToUserViewCapacityAssignedToUserViewById(String uuid,String linkUuid,String totalSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCapacityTotalPotentialCapacityTotalPotentialCapacity(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCapacityTransferCapacity(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCostCostCharacteristicCostCharacteristic(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCostCostCharacteristicCostCharacteristicById(String uuid,String linkUuid,String costNameCostValueCostAlgorithm,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferCostTransferCost(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferIntegrityTransferIntegrity(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferTimingLatencyCharacteristicLatencyCharacteristic(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferTimingLatencyCharacteristicLatencyCharacteristicById(String uuid,String linkUuid,String trafficPropertyNameTrafficPropertyQueingLatency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkTransferTimingTransferTiming(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkValidationValidation(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkValidationValidationMechanismValidationMechanism(String uuid,String linkUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyLinkValidationValidationMechanismValidationMechanismById(String uuid,String linkUuid,String validationMechanismLayerProtocolAdjacencyValidatedValidationRobustness,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNameName(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNameNameById(String uuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeLabelLabel(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeLabelLabelById(String uuid,String nodeUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeNameName(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeNameNameById(String uuid,String nodeUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeNode(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeNodeById(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLabelLabel(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLabelLabelById(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLayerProtocolLayerProtocol(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLayerProtocolLayerProtocolById(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,String localId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLayerProtocolNameName(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,String localId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointLayerProtocolNameNameById(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,String localId,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointNameName(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointNameNameById(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,String valueName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointOwnedNodeEdgePoint(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointOwnedNodeEdgePointById(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeOwnedNodeEdgePointStateState(String uuid,String nodeUuid,String ownedNodeEdgePointUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeStateState(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCapacityAvailableCapacityAvailableCapacity(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCapacityCapacityAssignedToUserViewCapacityAssignedToUserView(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCapacityCapacityAssignedToUserViewCapacityAssignedToUserViewById(String uuid,String nodeUuid,String totalSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCapacityTotalPotentialCapacityTotalPotentialCapacity(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCapacityTransferCapacity(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCostCostCharacteristicCostCharacteristic(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCostCostCharacteristicCostCharacteristicById(String uuid,String nodeUuid,String costNameCostValueCostAlgorithm,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferCostTransferCost(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferIntegrityTransferIntegrity(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferTimingLatencyCharacteristicLatencyCharacteristic(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferTimingLatencyCharacteristicLatencyCharacteristicById(String uuid,String nodeUuid,String trafficPropertyNameTrafficPropertyQueingLatency,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyNodeTransferTimingTransferTiming(String uuid,String nodeUuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyTopology(SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveContextTopologyTopologyById(String uuid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateContextById(ContextSchema context,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateContextLabelLabelById(String valueName,NameAndValue label,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateContextNameNameById(String valueName,NameAndValue name,SecurityContext securityContext) throws NotFoundException;
}
